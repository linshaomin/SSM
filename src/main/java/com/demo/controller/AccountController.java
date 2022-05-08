package com.demo.controller;

import com.demo.base.R;
import com.demo.domain.Account;
import com.demo.exception.ServiceException;
import com.demo.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 账户web
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/page")
    public R<PageInfo<Account>> findAll() {
        PageHelper.startPage(1, 3);
        List<Account> all = accountService.findAll();
        PageInfo page = new PageInfo(all);
        return R.data(page);
    }

    @PostMapping("/save")
    public String save(Account account){
        accountService.saveAccount(account);
        return "list";
    }
}
