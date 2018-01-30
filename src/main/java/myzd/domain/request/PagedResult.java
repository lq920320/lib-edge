package myzd.domain.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class PagedResult<T>{
  private List<T> list;
  private Integer size;
  private Integer pageSize;
  private Integer page;
}
