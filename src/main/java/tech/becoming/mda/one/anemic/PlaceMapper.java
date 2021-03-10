package tech.becoming.mda.one.anemic;

import org.springframework.stereotype.Component;

@Component
public class PlaceMapper {

    public Place toEntity(NewPlaceDTO dto) {
        return Place
                .builder()
                .password(dto.getPassword())
                .build();
    }

    public PlaceDTO toDto(Place saved) {
        return PlaceDTO
                .builder()
                .id(saved.getId())
                .build();
    }
}