{
  description = "A reproducible Java development environment with modern tooling.";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-25.11";
    flake-utils.url = "github:numtide/flake-utils";
  };
  outputs =
    {
      self,
      nixpkgs,
      flake-utils,
    }:
    flake-utils.lib.eachDefaultSystem (
      system:
      let
        pkgs = nixpkgs.legacyPackages.${system};
        jdk = pkgs.jdk25;
        gradle = pkgs.gradle_9;
      in
      {
        devShells.default = pkgs.mkShell {
          packages = [
            jdk
            gradle
            pkgs.jdt-language-server
          ];
          JAVA_HOME = "${jdk.home}";
          shellHook = ''
            	    echo "Entering Java development environment..."
                        echo "Java version: $(java --version | head -n 1)"
                        echo "Available tools: java, javac, gradle, jdtls"
          '';
        };
      }
    );
}
