package tech.becoming.mda.one.anemic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "places")
@RequiredArgsConstructor
@Slf4j
public class PlaceController {

    private final PlaceService service;

    @GetMapping
    // @Secured
    public Iterable<Place> findAllPlace() {
        log.debug("GET /places");
        return service.findAll();
    }

    @PostMapping
    public PlaceDTO createPlace(NewPlaceDTO place) {
        log.debug("POST /places");
        return service.save(place);
    }

}
