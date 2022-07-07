package ajaxPostSample.ajaxPostSample.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PostController {

    @PostMapping("/postAgeByName")
    /* inputMap 파라미터를 받아, 미리 저장된 ageMap에서 해당 이름에 맵핑된 나이를 리턴해주는 메소드 */
    public Map<String,Object> postAgeByName(@RequestBody Map<String,Object> inputMap ) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("tom", 10);
        ageMap.put("bob", 20);
        ageMap.put("kim", 30);
        ageMap.put("chan", 20);

        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("name", inputMap.get("name"));
        returnMap.put("age", ageMap.get(inputMap.get("name")));

        return returnMap;
    }
}
