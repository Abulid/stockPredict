package com.qqt.stockpredict.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qqt.stockpredict.mapper.StocknewsMapper;
import com.qqt.stockpredict.model.entity.Stocknews;
import com.qqt.stockpredict.service.StocknewsService;
import org.springframework.stereotype.Service;

/**
* @author QQT
* @description 针对表【stocknews(股市新闻)】的数据库操作Service实现
* @createDate 2024-02-04 17:56:49
*/
@Service
public class StocknewsServiceImpl extends ServiceImpl<StocknewsMapper, Stocknews>
    implements StocknewsService{

}




