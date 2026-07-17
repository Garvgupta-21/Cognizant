package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // STEP 1: Arrange - create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // STEP 2: Stub behavior
        when(mockApi.getData()).thenReturn("Mock Data");

        // STEP 3: Inject mock into service
        MyService service = new MyService(mockApi);

        // STEP 4: Act
        String result = service.fetchData();

        // STEP 5: Assert
        assertEquals("Mock Data", result);
    }
}