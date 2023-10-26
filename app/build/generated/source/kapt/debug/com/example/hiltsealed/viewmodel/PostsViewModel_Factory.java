package com.example.hiltsealed.viewmodel;

import com.example.hiltsealed.repository.PostsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class PostsViewModel_Factory implements Factory<PostsViewModel> {
  private final Provider<PostsRepository> postsRepositoryProvider;

  public PostsViewModel_Factory(Provider<PostsRepository> postsRepositoryProvider) {
    this.postsRepositoryProvider = postsRepositoryProvider;
  }

  @Override
  public PostsViewModel get() {
    return newInstance(postsRepositoryProvider.get());
  }

  public static PostsViewModel_Factory create(Provider<PostsRepository> postsRepositoryProvider) {
    return new PostsViewModel_Factory(postsRepositoryProvider);
  }

  public static PostsViewModel newInstance(PostsRepository postsRepository) {
    return new PostsViewModel(postsRepository);
  }
}
