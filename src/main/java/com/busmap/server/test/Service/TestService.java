package com.busmap.server.test.Service;

import com.busmap.server.test.Entity.Test;
import com.busmap.server.test.Repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public void test() {

        Test test = new Test();

        test.setValue("하하가 아닙니다");

        testRepository.save(test);
    }
}
