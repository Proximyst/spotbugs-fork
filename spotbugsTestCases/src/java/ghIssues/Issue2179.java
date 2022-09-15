package ghIssues;

import java.util.concurrent.CompletableFuture;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class Issue2179 {

  public CompletableFuture<@Nullable String> example1() {
    return CompletableFuture.completedFuture(null);
  }

  public @NonNull CompletableFuture<@Nullable String> example2() {
    return CompletableFuture.completedFuture(null);
  }

  public void report() {
    this.example1().thenAccept(s -> {
    });
    this.example2().thenAccept(s -> {
    });
  }
}
