package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("------Creating Employee Object-------");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		//emp.work(); not prefered way
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println();
		
		System.out.println("------Creating ScrumTeam Object-------");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println();
		
		System.out.println("------Creating Developer Object-------");
		Developer dev=new Developer();
		Developer.work();
		dev.salary=12000;
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.attendScrumMeetings();
		dev.workOnArtifacts();
		dev.code();
		
		System.out.println();
		
		System.out.println("------Creating Tester Object-------");
		Tester qa=new Tester();
		qa.salary=12000;
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.attendScrumMeetings();
		qa.workOnArtifacts();
		qa.test();
		
		System.out.println();
		
		System.out.println("------Creating Busniss Analyst Object-------");
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.salary=12000;
		ba.getPaid();
		ba.artifacts="Sprint backlog, Product Backlog";
		ba.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.attendScrumMeetings();
		ba.workOnArtifacts();
		ba.writeUserStories();
		
		System.out.println();
		
		System.out.println("------Creating Scrum Master Object-------");
		ScrumMaster sm=new ScrumMaster();
		sm.salary=12000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.attendScrumMeetings();
		sm.workOnArtifacts();
		sm.driveScrumMeetings();
		
		System.out.println();
		
		System.out.println("------Creating Product Owner Object-------");
		ProductOwner po=new ProductOwner();
		po.salary=12000;
		po.getPaid();
		po.artifacts="Spring Backlog, Product Backlog";
		po.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo";
		po.attendScrumMeetings();
		po.workOnArtifacts();
		po.talkToTheClient();
		
		System.out.println();
		
		System.out.println("------Creating Front End Developer Object-------");
		FrontEndDev edev=new FrontEndDev();
		edev.salary=12000;
		edev.getPaid();
		edev.artifacts="Spring Backlog, Product Backlog";
		edev.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo";
		edev.attendScrumMeetings();
		edev.workOnArtifacts();
		edev.doHtml();
		
		System.out.println();
		
		System.out.println("------Creating Back End Developer Object-------");
		BackEndDev bdev=new BackEndDev();
		bdev.salary=12000;
		bdev.getPaid();
		bdev.artifacts="Spring Backlog, Product Backlog";
		bdev.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo";
		bdev.attendScrumMeetings();
		bdev.workOnArtifacts();
		bdev.doSql();
		
		System.out.println();
		
		System.out.println("------Creating Manual Tester Object-------");
		ManualTester mtester=new ManualTester();
		mtester.salary=12000;
		mtester.getPaid();
		mtester.artifacts="Spring Backlog, Product Backlog";
		mtester.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo";
		mtester.attendScrumMeetings();
		mtester.workOnArtifacts();
		mtester.testManually();
		
		System.out.println();
		
		System.out.println("------Creating Automation Tester Object-------");
		AutomationTester atester=new AutomationTester();
		atester.salary=12000;
		atester.getPaid();
		atester.artifacts="Spring Backlog, Product Backlog";
		atester.ceremonies="Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo";
		atester.attendScrumMeetings();
		atester.workOnArtifacts();
		atester.codeInJava();
	}

}
