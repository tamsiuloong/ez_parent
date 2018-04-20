package com.yaorange.jk.service.impl;

import com.yaorange.jk.dao.BaseDao;
import com.yaorange.jk.entity.Note;
import com.yaorange.jk.service.NoteService;
import com.yaorange.jk.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Description:	笔记
 * @Author:			Coach tam
 * @Company:		坚持灵活  灵活坚持
 * @CreateDate:		2018-4-7 9:43:36
 */
@Transactional
@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private BaseDao<Note,String> noteDao;

    @Override
    public Pagination findPage(Pagination page) {
        return noteDao.pageByHql("from Note",page.getPageNo(),page.getPageSize(),null);
    }

    @Override
    public Pagination findPage(Pagination page, String username) {
        return noteDao.pageByHql("from Note where createBy=?",page.getPageNo(),page.getPageSize(),username);
    }

    @Override
    public List<Note> findAll() {
        return noteDao.getListByHQL("from Note");
    }

    @Override
    public void save(Note model) {
        model.setCreateTime(new Date());
        noteDao.save(model);
    }

    @Override
    public void deleteByIds(String[] ids) {
        for (String id:ids) {
            noteDao.deleteById(Note.class,id);
        }
    }

    @Override
    public void update(Note model, String username) {
        Note note  = noteDao.get(Note.class,model.getId());
        model.setCreateBy(note.getCreateBy());
        model.setCreateTime(note.getCreateTime());
        model.setUpdateBy(username);
        model.setUpdateTime(new Date());
        noteDao.merge(model);
    }

    @Override
    public Note findById(String id) {
        return noteDao.get(Note.class,id);
    }
}
