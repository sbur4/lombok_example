package org.example.delegate;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@ToString
public class DelegationExample {
//    @Delegate(types = SimpleInterface.class)
    @Delegate
    List<String> collection = new ArrayList<>();
}