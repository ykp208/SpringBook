package org.zero.model.dao;

import java.util.List;

import org.zero.model.dto.BoardVO;
import org.zero.model.dto.Criteria;
import org.zero.model.dto.SearchCriteria;

public interface BoardDAO {
	  public void create(BoardVO vo) throws Exception;

	  public BoardVO read(Integer bno) throws Exception;

	  public void update(BoardVO vo) throws Exception;

	  public void delete(Integer bno) throws Exception;

	  public List<BoardVO> listAll() throws Exception;

	  public List<BoardVO> listPage(int page) throws Exception;

	  public List<BoardVO> listCriteria(Criteria cri) throws Exception;

	  public int countPaging(Criteria cri) throws Exception;
	  
	  //use for dynamic sql
	  
	  public List<BoardVO> listSearch(SearchCriteria cri)throws Exception;
	  
	  public int listSearchCount(SearchCriteria cri)throws Exception;
	  
	  
	  public void updateReplyCnt(Integer bno, int amount)throws Exception;
	  
	  
	  public void updateViewCnt(Integer bno)throws Exception;
}
