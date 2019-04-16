package com.huidi.groups.controller;

import com.huidi.groups.model.Group;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final List<Group> groups;
    private int lastId;

    public RestController() {
        lastId = 0;
        groups = new LinkedList<>();
    }

    @RequestMapping(value = "/groups", method = RequestMethod.GET, produces = "application/json")
    public List<Group> firstPage() {
        return getGroups();
    }

    @RequestMapping(value = "/groups", method = RequestMethod.POST, produces = "application/json", consumes = "application/x-www-form-urlencoded")
    public Group createGroup(@RequestParam(value = "name") String name, @RequestParam(value = "description") String description) {
        final Group newGroup = new Group();
        newGroup.setId(String.valueOf(getNextId()));
        newGroup.setName(name);
        newGroup.setDescription(description);

        groups.add(newGroup);

        return newGroup;
    }

    private List<Group> getGroups() {
        return groups;
    }

    private int getNextId() {
        return lastId++;
    }
}
