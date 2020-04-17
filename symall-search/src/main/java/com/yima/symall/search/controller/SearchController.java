package com.yima.symall.search.controller;

import com.yima.core.bean.Resp;
import com.yima.symall.search.pojo.SearchParam;
import com.yima.symall.search.pojo.SearchResponseVO;
import com.yima.symall.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping
    public Resp<SearchResponseVO> search(SearchParam searchParam) throws IOException {

        SearchResponseVO responseVO = this.searchService.search(searchParam);
        return Resp.ok(responseVO);
    }
}
