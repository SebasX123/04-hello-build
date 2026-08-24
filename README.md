# hello-build

This build is **green on the machine it was made on** and **red from a clean
clone**. Four things it needs were never committed to the repository.

Your job: make `./gradlew test` pass **from a clean clone** by removing every
dependency on something outside the repository. There are four failing tests;
each one explains, in its comment, the hidden input it depends on.

Work inside the box: this repository carries `.devcontainer/devcontainer.json`,
naming the same Linux image the grader uses. Start a codespace, or run
`devcontainer up --workspace-folder .` with Docker. Then:

```
$ ./gradlew test
```

You'll see four failures — the same four the grader sees. The box gives you the
machine; it cannot commit your files for you. For each, ask the question from
session 03:

> **"What does this build depend on that I didn't commit?"**

…then make the repository carry it — a committed resource, a committed file, a
value provided by the build, a step the build regenerates.

**How you know you're done:** not your local green — a clean-clone green. Push,
mark your PR **ready for review**, and ivan>thron clones you fresh and runs
`./gradlew test`. Green there is the deliverable.

See the session handout for the full brief.
