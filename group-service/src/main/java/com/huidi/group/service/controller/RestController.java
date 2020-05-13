package com.huidi.group.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huidi.group.service.model.Group;

@CrossOrigin(origins = "http://localhost:4200")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(value = "/groups", method = RequestMethod.GET, produces = "application/json")
	public List<Group> firstPage() {
		final Group group1 = new Group();
		group1.setId("01");
		group1.setName("Schachgruppe");
		group1.setDescription("Eine Gruppe zum Schach spielen.");
		final Group group2 = new Group();
		group2.setId("02");
		group2.setName("Sportgruppe");
		group2.setDescription("Für alle die gerne fit sind.");
		final Group group3 = new Group();
		group3.setId("03");
		group3.setName("Häkelgruppe");
		group3.setDescription("Kinderkleidung selber machen.");

		final List<Group> allGroups = new ArrayList<>();
		allGroups.add(group1);
		allGroups.add(group2);
		allGroups.add(group3);

		return allGroups;
	}

}
