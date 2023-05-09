package cinema.app.spring.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}
