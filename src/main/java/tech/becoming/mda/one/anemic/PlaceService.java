package tech.becoming.mda.one.anemic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaceService {

    private final PlaceRepository repository;
    private final ValidationHelper validationHelper;
    private final PlaceMapper mapper;

    // @Secured
    public Iterable<Place> findAll() {
        return repository.findAll();
    }

    // @Secured
    public PlaceDTO save(NewPlaceDTO dto) {
        validationHelper.validate(dto);
        var place = mapper.toEntity(dto);

        final var saved = repository.save(place);

        return mapper.toDto(saved);
    }
}
