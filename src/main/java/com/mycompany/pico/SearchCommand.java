package com.mycompany.pico;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.*;
import com.mycompany.app.App;

@Command(name = "search", description = "Search questions matching criteria.", mixinStandardHelpOptions = true)
final public class SearchCommand implements Runnable {

  @Option(names = {"-q", "--query"}, description = "Search phrase.")
  String query = "";

  @Option(names = {"-t", "--tag"}, description = "Search inside specific tag.")
  String tag = "";

  @Option(names = {"-n", "--limit"}, description = "Limit results. Default: 10")
  int limit = 10;

  @Option(names = {"-s", "--sort-by"}, description = "Available values: relevance, votes, creation, activity. Default: relevance.")
  String sort = "relevance";

  @Option(names = {"--verbose"}, description = "Print verbose output.")
  boolean verbose;

  // @Inject
  // App app;

  // public static void main(String[] args) {
  //   System.out.println("Search command running via main...");
  // }

  public static void main(String[] args) {
    int exitCode = new CommandLine(new SearchCommand()).execute(args);
    System.exit(exitCode);
  }


  @Override
  public void run() {
    System.out.println("Search command running...");
  }
}
