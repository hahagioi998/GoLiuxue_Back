package com.kenkoku.goliuxue.controller;

import com.kenkoku.common.R;
import com.kenkoku.goliuxue.entity.Word;
import com.kenkoku.goliuxue.service.WordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/edu/test")
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping
    public R hello() {

        List<Word> list = wordService.list(null);
        return R.ok().data("items", list);
    }

//    @PostConstruct
//    public void testInsert() {
//        Word word = new Word();
//        word.setKana("とりはだ");
//        word.setKanji("鳥肌");
//        word.setCn("鸡皮疙瘩");
//        word.setLevel(2);
//        word.setClassification("口语");
//
//        wordService.save(word);
//    }
}
