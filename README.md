This is the code corresponding to my [entry](blog.orakem.site/2020/09/note_taking_design.html) on creating a jorunaling app. (The name is a bit of misnomer, but I will come up with a good one later on.)

After weeks of thinking about what technology to use (Qt, Electron, Phoenix), I went with something I know, and something I am unfamiliar with: Java, and JavaFX. I know it's not the most glamorous of stacks, but boring code is better than unwritten code.

The project is divided into two modules: client and server. Eventually, I plan to make it so that server spawns a separate process, so that client and server can be completely decoupled.