package com.ssm.controller;

import com.ssm.service.DiaryService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.ResponseStatus;
import util.Result;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/10 22:36
 */
@Controller
public class DiaryController {
    @Autowired
    DiaryService diaryService;
    @RequestMapping(value="/list" ,produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResponseEntity<Object> list(Integer userid,Integer page){
        return ResponseEntity.status(HttpStatus.SC_OK).body(Result.success(diaryService.listByPage(userid,page)));
    }
}
