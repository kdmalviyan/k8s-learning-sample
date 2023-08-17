### DOCKER:
docker build --load -t k8s-app-spring .
docker run -p 8080:8080 k8s-app-spring 

### DOCKER Remote
docker build --push -t kdmalviyan/k8s-app-spring .
docker run -p 8080:8080 kdmalviyan/k8s-app-spring

### Kubernetes
## MINIKUBE
https://devopscube.com/minikube-mac/
https://devopscube.com/best-kubernetes-certifications/
breaw install minikube
minikube start --driver=hyperkit or minikube start --driver=virtualbox // Not supported on MacOS
# Alternative
brew install socket_vmnet
minikube start --driver qemu --network socket_vmnet --addons=ingress metrics-server

minikube addons enable metrics-server
minikube dashboard

## APPLY
kubectl apply -f ./k8s/deployment.yaml
kubectl apply -f ./k8s/service.yaml
kubectl apply -f ./k8s/ingress.yaml
minikube ip
192.168.105.2 k8s-spring-app.local
kubectl get pods
kubectl describe pod k8s-spring-app-69d999b654-mx8nr
minikube service expense-app-service --url

## DELETE
kubectl delete -f ./k8s/deployment.yaml

### ETCD
kubectl apply -f etcd-deployment.yaml
kubectl apply -f etcd-service.yaml

### INGRESS
minikube start --addons=ingress
kubectl apply -f ingress.yaml
kubectl delete -n default ingress my-society-ingress

### MEMORY CONFIG
minikube config set cpus 4
minikube config set memory 16384
minikube delete
minikube start <with right options>