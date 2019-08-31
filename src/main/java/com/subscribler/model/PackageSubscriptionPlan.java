package com.subscribler.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PackageSubscriptionPlan {
    private @NonNull String packageId;
    private @NonNull String subscriptionPlanId;
}
