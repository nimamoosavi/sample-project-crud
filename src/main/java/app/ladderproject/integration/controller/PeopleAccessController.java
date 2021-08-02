package app.ladderproject.integration.controller;

import app.ladderproject.crud.controller.BaseController;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import app.ladderproject.integration.service.PeopleAccessListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/integration/v1/people-access")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "People-access-list", description = "سرویس مدیریت افراد و سازمان ها و دسترسی خواندن و نوشتن آنها ")})
@RequiredArgsConstructor
public class PeopleAccessController extends BaseController<PeopleAccessListReqVM, PeopleAccessListResVM, Long> {

    private final PeopleAccessListService peopleAccessListService;


    @GetMapping(path = "/write/{peopleId}")
    public ResponseEntity<BaseDTO<List<PeopleAccessListResVM>>> findAllByPeopleIdAndWriteAccessTrue(@PathVariable Long peopleId) {
        return ResponseEntity.ok(peopleAccessListService.findAllByPeopleIdAndWriteAccessTrue(peopleId));
    }

    @GetMapping(path = "/read/{peopleId}")
    public ResponseEntity<BaseDTO<List<PeopleAccessListResVM>>> findAllByPeopleIdAndReadAccessTrue(@PathVariable Long peopleId) {
        return ResponseEntity.ok(peopleAccessListService.findAllByPeopleIdAndReadAccessTrue(peopleId));
    }

}
