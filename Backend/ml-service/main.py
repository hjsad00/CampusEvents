import os
from contextlib import asynccontextmanager
from fastapi import FastAPI
import py_eureka_client.eureka_client as eureka_client

PORT = int(os.getenv("PORT", "8086"))

@asynccontextmanager
async def lifespan(app: FastAPI):
    await eureka_client.init_async(
        eureka_server="http://localhost:8761/eureka",
        app_name="ml-service",
        instance_port=PORT,
        instance_ip="127.0.0.1",
    )
    yield
    await eureka_client.stop_async()

app = FastAPI(lifespan=lifespan)

@app.get("/api/ml/hello")
def hello():
    return {"message": "Hello from ml-service"}