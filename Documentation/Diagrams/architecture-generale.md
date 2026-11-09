
flowchart TB
    U[Étudiant]
    CM[Responsable de club]
    A[Administrateur]

    GW[API Gateway]
    KC[Keycloak]
    EV[Event Service]
    CL[Club Service]
    VE[Venue Service]
    RE[Registration Service]
    ML[ML Service]
    NO[Notification Service]
    DB[(Bases de données)]

    U --> GW
    CM --> GW
    A --> GW

    GW --> KC
    GW --> EV
    GW --> CL
    GW --> VE
    GW --> RE

    EV --> VE
    EV --> ML
    EV --> NO

    EV --> DB
    CL --> DB
    VE --> DB
    RE --> DB
