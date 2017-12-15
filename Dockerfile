FROM https://cse.cn-north-1.myhwclouds.com:443/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/qwwei-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
