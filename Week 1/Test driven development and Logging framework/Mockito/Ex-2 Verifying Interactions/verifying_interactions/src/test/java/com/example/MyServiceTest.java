package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // STEP 1: Arrange - create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // STEP 2: Inject mock into service
        MyService service = new MyService(mockApi);

        // STEP 3: Act - call method
        service.fetchData();

        // STEP 4: Verify interaction
        verify(mockApi).getData();
    }
}