package com.example.hiltsealed.repository;

import com.example.hiltsealed.data.remote.ApiServices;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostsRepository_Factory implements Factory<PostsRepository> {
  private final Provider<ApiServices> apiServicesProvider;

  public PostsRepository_Factory(Provider<ApiServices> apiServicesProvider) {
    this.apiServicesProvider = apiServicesProvider;
  }

  @Override
  public PostsRepository get() {
    return newInstance(apiServicesProvider.get());
  }

  public static PostsRepository_Factory create(Provider<ApiServices> apiServicesProvider) {
    return new PostsRepository_Factory(apiServicesProvider);
  }

  public static PostsRepository newInstance(ApiServices apiServices) {
    return new PostsRepository(apiServices);
  }
}
