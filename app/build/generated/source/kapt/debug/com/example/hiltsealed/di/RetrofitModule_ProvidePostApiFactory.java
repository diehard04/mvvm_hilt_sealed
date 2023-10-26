package com.example.hiltsealed.di;

import com.example.hiltsealed.data.remote.ApiServices;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class RetrofitModule_ProvidePostApiFactory implements Factory<ApiServices> {
  private final Provider<Retrofit.Builder> retrofitBuilderProvider;

  public RetrofitModule_ProvidePostApiFactory(Provider<Retrofit.Builder> retrofitBuilderProvider) {
    this.retrofitBuilderProvider = retrofitBuilderProvider;
  }

  @Override
  public ApiServices get() {
    return providePostApi(retrofitBuilderProvider.get());
  }

  public static RetrofitModule_ProvidePostApiFactory create(
      Provider<Retrofit.Builder> retrofitBuilderProvider) {
    return new RetrofitModule_ProvidePostApiFactory(retrofitBuilderProvider);
  }

  public static ApiServices providePostApi(Retrofit.Builder retrofitBuilder) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.providePostApi(retrofitBuilder));
  }
}
