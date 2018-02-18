package com.hserang;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

/**
 * @author Haroun Serang
 */
public class Query implements GraphQLRootResolver {
    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}


