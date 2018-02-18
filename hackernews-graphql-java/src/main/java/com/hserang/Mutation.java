package com.hserang;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

/**
 * @author Haroun Serang
 */
public class Mutation implements GraphQLRootResolver {
    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link createLink(String id, String url, String description) {

        Link newLink = new Link(id, url, description);
        linkRepository.saveLink(newLink);

        return newLink;
    }
}
