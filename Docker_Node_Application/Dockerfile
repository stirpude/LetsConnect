FROM amazonlinux
RUN yum install -y sudo
RUN yum install -y gcc-c++ make
RUN curl -sL https://rpm.nodesource.com/setup_13.x | sudo -E bash -
RUN yum install -y nodejs 
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY /src /usr/src/app
RUN npm install
EXPOSE 3000
CMD [ "node", "server.js" ]




