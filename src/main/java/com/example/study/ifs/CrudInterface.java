package com.example.study.ifs;

import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.model.network.response.UserApiResponse;

public interface CrudInterface<Req,Res> {

    Header<Res> create(Req request);  // todo request objcet 추가

    Header<Res> read(Long id);

    Header<Res> update(Req request);

    Header delete(Long id);
}
