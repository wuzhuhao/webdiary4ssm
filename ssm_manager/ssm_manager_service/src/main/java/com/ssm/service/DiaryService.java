package com.ssm.service;

import com.ssm.pojo.Diary;
import org.springframework.stereotype.Service;
import util.PageBean;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/10 21:54
 */

public interface DiaryService {
    PageBean<Diary> listByPage(int uid,int page);

}
