package com.kenkoku.goliuxue.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kenkoku.goliuxue.entity.Word;
import com.kenkoku.goliuxue.entity.vo.WordQuery;

public interface WordService extends IService<Word> {

    void pageQuery(Page<Word> pageParam, WordQuery teacherQuery);
}
