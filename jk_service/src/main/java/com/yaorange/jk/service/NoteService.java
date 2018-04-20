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
    /**
     * 根据用户名查看笔记本
     * @param page
     * @param username
     * @return
     */
    Pagination findPage(Pagination page, String username);

    /**
     * 查看所有的笔记本
     * @param pageNo
     * @return
     */
    Pagination findPage(Pagination pageNo);

    List<Note> findAll();

    void save(Note model);

    Note findById(String id);

    void update(Note model, String username);

    void deleteByIds(String[] id);


}
