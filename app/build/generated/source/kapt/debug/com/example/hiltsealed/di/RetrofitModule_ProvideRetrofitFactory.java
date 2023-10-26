package com.example.hiltsealed.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit.Builder> {
  @Override
  public Retrofit.Builder get() {
    return provideRetrofit();
  }

  public static RetrofitModule_ProvideRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit.Builder provideRetrofit() {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideRetrofit());
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvideRetrofitFactory INSTANCE = new RetrofitModule_ProvideRetrofitFactory();
  }
}
