# AWS Highly Available Web Application Deployment

## Overview
This project demonstrates the deployment of a highly available web application on AWS using a range of cloud services. The solution emphasizes scalability, security, and automation while integrating Dockerized frontend and backend applications. The deployment adheres to AWS best practices for infrastructure design and management.

---

## Table of Contents
1. [Project Objectives](#project-objectives)
2. [Architecture Overview](#architecture-overview)
3. [Key Components](#key-components)
4. [Deployment Process](#deployment-process)
5. [Technologies Used](#technologies-used)
6. [Repository Structure](#repository-structure)
7. [Documentation](#documentation)
8. [Contributors](#contributors)

---

## Project Objectives
The primary goal of this project is to:
- Design and implement a highly available (HA) web application using AWS services.
- Containerize both frontend and backend components for portability and scalability.
- Ensure secure access to private resources via a bastion host.
- Automate deployment steps for ease of replication.

---

## Architecture Overview
The project architecture includes:
- **Custom VPC**: A Virtual Private Cloud with public and private subnets to host application tiers.
- **Load Balancer**: Application Load Balancer (ALB) for traffic distribution across multiple backend instances.
- **Auto Scaling Group**: Automatically adjusts the number of instances based on demand.
- **Bastion Host**: Provides secure SSH access to private resources.
- **Relational Database**: AWS RDS MySQL instance for backend data storage.
- **Dockerized Applications**: Frontend and backend services containerized and deployed on EC2 instances.

---

## Key Components
### 1. **Networking**
- VPC with CIDR block `10.0.0.0/16`.
- Public and private subnets with associated route tables.
- NAT Gateway for internet access from private subnets.

### 2. **Compute**
- EC2 instances hosting:
  - **Frontend**: Public subnet.
  - **Backend**: Private subnet.

### 3. **Storage**
- MySQL database hosted on AWS RDS.

### 4. **Security**
- Security groups to restrict inbound/outbound traffic.
- Bastion host for controlled access to private EC2 instances.

### 5. **Deployment**
- Backend: Dockerized Spring Boot application.
- Frontend: Dockerized React application.
- Deployment automation using Docker and AWS CLI.

---

## Deployment Process
1. **VPC and Networking**:
   - Created a VPC with public and private subnets.
   - Configured NAT Gateway and route tables for connectivity.

2. **Security**:
   - Set up security groups for frontend, backend, database, and bastion host.
   - Restricted SSH access to specific IP ranges.

3. **Compute Resources**:
   - Launched EC2 instances for frontend and backend.
   - Configured an Auto Scaling Group for backend instances.

4. **Database**:
   - Deployed an RDS MySQL instance.
   - Configured connectivity with the backend.

5. **Application Deployment**:
   - Built Docker images for frontend and backend.
   - Deployed Docker containers on respective EC2 instances.

6. **Load Balancer**:
   - Configured an Application Load Balancer to route traffic to backend instances.

---

## Technologies Used
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![React](https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

---

## Repository Structure

AWS_App/ └──├── src/ # Backend source code 
         │ ├── AWS_Project_Report.pdf # Detailed project report 
         │ ├── Dockerfile # Backend Docker configuration 
         │ └── README.md # Project documentation 


---

## Documentation
For detailed technical documentation, including screenshots and implementation steps, refer to the [AWS Project Report](./aws_project__Cloud__.pdf).

---

## Contributors
- **Mohamed Jbeli**  
  _Cloud Engineer and Developer_  
  [LinkedIn](https://www.linkedin.com/in/mohamedjbeli/) | [GitHub](https://github.com/mohamedjbelii)

---
