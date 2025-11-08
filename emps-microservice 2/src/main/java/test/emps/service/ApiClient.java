package test.emps.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import test.emps.dto.DepartmentDto;

//@FeignClient(url="http://localhost:8888",value="depts-microservice")
@FeignClient("DEPTS-MICROSERVICE")
public interface ApiClient {
    @GetMapping("api/departments/{department-code}")
    public DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
