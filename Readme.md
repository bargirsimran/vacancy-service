docker build -t vacancy-service:latest -f dockerfile .

docker run -it --rm --name vacancy-service vacancy-service:latest
