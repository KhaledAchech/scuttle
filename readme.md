# Scuttle

Scuttle is a web application for hosting large game asset files. It allows game developers to upload and share asset files such as textures, sounds, and models, and provides an easy-to-use interface for users to browse and download these files.

## Features

- Upload and manage game asset files
- Browse and search assets by category, tag, and keyword
- Preview assets with 3D models, audio players, and image viewers
- Download assets with one click or add them to a collection for later use
- User authentication and authorization with role-based access control

## Technology Stack

- Backend: Python, SpringBoot(Java), PostgreSQL, ...
- Frontend: Angular, ...

## Getting Started

To run the application locally, you will need to have Docker and Docker Compose installed on your machine. Then, follow these steps:

1. Clone the repository: `git clone https://github.com/KhaledAchech/scuttle.git`
2. Navigate to the project directory: `cd scuttle`
3. Create a `.env` file with the required environment variables (e.g. database credentials)
4. Build and run the Docker containers: `docker-compose up --build`
5. Open your web browser and navigate to `http://localhost:3000` to view the application

## License

This project is intended for private usage and is not licensed for distribution or commercial use. See the LICENSE file for more information.
