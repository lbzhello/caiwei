package xyz.lius.blog.api;

import xyz.lius.blog.model.News;

import java.util.List;

public interface NewsService {
    List<News> findList();
}
