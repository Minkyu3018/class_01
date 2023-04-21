package controller;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import dao.DeptDao;
import domain.Dept;
import main.DeptManagerMain;
import service.DeptListService;
import service.DeptSearchService;
import service.DeptUpdateService;

public class DeptUpdateController {
	
	DeptListService listService;
	DeptSearchService searchService;
	DeptUpdateService updateService;
	

	private DeptUpdateController() {
		this.listService = DeptListService.getInstance();
		this.searchService = DeptSearchService.getInstance();
		this.updateService = DeptUpdateService.getInstance(); 

	}
	
	private static DeptUpdateController controller = new DeptUpdateController();
	
	public static DeptUpdateController getInstance() {
		return controller;
	}

	public void process() {
		
		// 1. 수정하고자하는 데이터를 사용자로부터 받아서 => Dept
		Dept newDept = inputUpdateDept();
		
		// 2. Service에 Dept를 전달해서 수정 => 결과 반환 (1 or 0)
		int result = updateService.updateDept(newDept);
		
		// 3. 결과 값에 따른 결과 출력
		printData(result);
		
		
	}
	
	private void printData(int result) {
		if(result>0) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("수정 실패.(입력 시 데이터를 확인 후 입력)");
		}
	}
	
	
	private Dept inputUpdateDept() {
		
		// 1. 수정하고자하는 부서번호를 입력하세요.
		System.out.println("부서정보 수정을 시작합니다.");
		
		//    전체리스트 출력
		System.out.println("-----------------------------");
		
		List<Dept> list = listService.getDeptList();
		for(Dept d : list) {
			System.out.println(d.getDeptno()+ " / "+d.getDname()+ " / "+d.getLoc());
			}
		
		System.out.println("-----------------------------");
		
		System.out.println("수정하고자하는 부서번호를 입력하세요.>>>");
		
		// 사용자가 부서번호를 입력
		int deptno =Integer.parseInt(DeptManagerMain.sc.nextLine());
		
		
		// 2. 해당 부서번호의 데이터를 가져와서 보여준다.
		Dept dept = searchService.searchDept(deptno);
		System.out.println("-----------------------------");
		System.out.println(dept);
		System.out.println("-----------------------------");

		// Dept => 사용자가 입력한 부서의 저장되어 있는 데이터를 가지는 Dept
		
		// 3. 수정할 데이터를 입력받아 => Dept
		System.out.println(deptno + "번 부서의 정보 수정을 시작합니다.");
		System.out.println("수정하고자하는 새로운 부서 이름을 입력하세요.>>>");
		String newDname = DeptManagerMain.sc.nextLine();
		dept.setDname(newDname);
		System.out.println("새로운 위치정보를 입력하세요.>>>");
		String newLoc = DeptManagerMain.sc.nextLine();
		dept.setLoc(newLoc);
		
		
		return dept;
	}
	
	public static void main(String[] args) {
		
		DeptUpdateController contrller = new DeptUpdateController();
		
		Dept dept = contrller.inputUpdateDept();
		System.out.println(dept);
		
		
	}
}
