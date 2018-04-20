package com.yaorange.jk.web.controller.student;

import com.yaorange.jk.entity.Note;
import com.yaorange.jk.service.NoteService;
import com.yaorange.jk.utils.Pagination;
import com.yaorange.jk.web.controller.BaseCtrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.security.Security;
import java.util.List;

/**
 * @Description:	笔记
 * @Author:			Coach tam
 * @Company:		坚持灵活  灵活坚持
 * @CreateDate:		2018-4-7 9:43:36
 */
@RequestMapping("/student/mynote")
@RestController
public class NoteCtrl extends BaseCtrl {

    @Autowired
    private NoteService nodeService;



    @GetMapping
    public Pagination list(Pagination page)
    {

        String username = getUser().getUsername();
        Pagination result = nodeService.findPage(page,username);
        return result;
    }


    @GetMapping("getAll")
    public List<Note> getAll(Pagination page)
    {
        List<Note> noteList = nodeService.findAll();
        return noteList;
    }

    @DeleteMapping
    public String delete(@RequestBody String[] ids)
    {
        nodeService.deleteByIds(ids);
        return "1";
    }


    @PutMapping
    public String update(@RequestBody Note note)
    {
        String username = getUser().getUsername();
        nodeService.update(note,username);
        return "1";
    }

    @PostMapping
    public Note add(Note note)
    {
        String username = getUser().getUsername();
        note.setCreateBy(username);

        nodeService.save(note);
        return note;
    }
}
