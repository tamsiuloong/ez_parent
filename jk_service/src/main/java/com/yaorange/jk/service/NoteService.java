package com.yaorange.jk.service;

import com.yaorange.jk.entity.Note;
import com.yaorange.jk.utils.Pagination;

import java.util.List;
/**
 * @Description:	笔记
 * @Author:			Coach tam
 * @Company:		坚持灵活  灵活坚持
 * @CreateDate:		2018-4-7 9:43:36
 */
public interface NoteService {
    Pagination findPage(Pagination pageNo);

    List<Note> findAll();

    void save(Note model);

    Note findById(String id);

    void update(Note model);

    void deleteByIds(String[] id);
}
