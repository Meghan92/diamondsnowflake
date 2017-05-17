# Modded Minecraft Repository

## Branching strategy

The branching strategy follows the setup indicated below.

### master

| Item  | Description  |
|---|---|
| master  | Publicly accessible, tested code  |

### release/ddmmyy

This branch is used for merging multiple branches that are ready for public access into the corresponding master branch. It is used for integration testing of multiple mods.

| Item  | Description  |
|---|---|
| release  | Publicly accessible, tested code  |
| ddmmyy  | Date for release  |

### mod

This branch is used for the version specific mod development.

| Item  | Description  |
|---|---|
| mod | Publicly accessible branch of your mod and the name of your mod, branched off master, all lowercase  | 
