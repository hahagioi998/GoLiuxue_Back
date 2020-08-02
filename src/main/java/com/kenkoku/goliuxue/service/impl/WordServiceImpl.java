package com.kenkoku.goliuxue.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kenkoku.goliuxue.entity.Word;
import com.kenkoku.goliuxue.entity.vo.WordQuery;
import com.kenkoku.goliuxue.mapper.WordMapper;
import com.kenkoku.goliuxue.service.WordService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class WordServiceImpl extends ServiceImpl<WordMapper, Word> implements WordService {

    @Override
    public void pageQuery(Page<Word> pageParam, WordQuery wordQuery)
    {
        QueryWrapper<Word> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort");

        //没有确切对象
        if (wordQuery == null){
            baseMapper.selectPage(pageParam, queryWrapper);
            return;
        }

        //查询条件 姓名，级别，注册时间范围
        String name = wordQuery.getName();

        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("name", name);
        }

        baseMapper.selectPage(pageParam, queryWrapper);
    }
}
