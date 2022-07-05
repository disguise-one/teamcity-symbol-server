package jetbrains.buildServer.symbols;

import jetbrains.buildServer.SimpleCommandLineProcessRunner;
import jetbrains.buildServer.serverSide.TeamCityProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LongRunningProcessRunCallback implements SimpleCommandLineProcessRunner.ProcessRunCallback {

  private static final int DEFAULT_TIMEOUT_SECONDS = 60 * 60 * 24;

  @Nullable
  @Override
  public Integer getMaxAcceptedOutputSize() {
    return null;
  }

  @Override
  public void onProcessStarted(@NotNull Process process) {

  }

  @Override
  public void onProcessFinished(@NotNull Process process) {

  }

  @Nullable
  @Override
  public Integer getOutputIdleSecondsTimeout() {
    return TeamCityProperties.getInteger("teamcity.execution.timeout", DEFAULT_TIMEOUT_SECONDS);
  }
}
