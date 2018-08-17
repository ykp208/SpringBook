package org.zero.model.service;




import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import org.zero.model.dao.BoardDAO;
import org.zero.model.dto.BoardVO;
import org.zero.model.dto.Criteria;
import org.zero.model.dto.SearchCriteria;


@Service
public class BoardServiceImpl implements BoardService {

  @Inject
  private BoardDAO dao;

  @Override
  public void regist(BoardVO board) throws Exception {
    dao.create(board);
  }

//  @Override
//  public BoardVO read(Integer bno) throws Exception {
//    return dao.read(bno);
//  }


  @Transactional(isolation=Isolation.READ_COMMITTED)
  @Override
  public BoardVO read(Integer bno) throws Exception {
    dao.updateViewCnt(bno);
    return dao.read(bno);
  }

  
  @Override
  public void modify(BoardVO board) throws Exception {
    dao.update(board);
  }

  @Override
  public void remove(Integer bno) throws Exception {
    dao.delete(bno);
  }

  @Override
  public List<BoardVO> listAll() throws Exception {
    return dao.listAll();
  }

  @Override
  public List<BoardVO> listCriteria(Criteria cri) throws Exception {

    return dao.listCriteria(cri);
  }

  @Override
  public int listCountCriteria(Criteria cri) throws Exception {

    return dao.countPaging(cri);
  }

  @Override
  public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {

    return dao.listSearch(cri);
  }

  @Override
  public int listSearchCount(SearchCriteria cri) throws Exception {

    return dao.listSearchCount(cri);
  }


}
