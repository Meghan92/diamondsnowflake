# Modded Minecraft Repository

## Branching strategy

The branching strategy follows the setup indicated below.

### master/1.11.2

| Item  | Description  |
|---|---|
| master  | Publicly accessible, tested code  |
| 1.11.2  | Minecraft version support  |

### release/1.11.2/ddmmyy

This branch is used for merging multiple branches that are ready for public access into the corresponding master branch. It is used for integration testing of multiple mods.

| Item  | Description  |
|---|---|
| release  | Publicly accessible, tested code  |
| ddmmyy  | Date for release  |

### mod/1.11.2

This branch is used for the version specific mod development.

| Item  | Description  |
|---|---|
| mod/1.11.2  | Publicly accessible branch of your mod  | 
| mod  | Name of your mod, branched off master, all lowercase  |

### mod/1.11.2/type/description

This branch is a suggested branch for use when there are multiple developers or changes that need to be taken into the main mod branch. Similar to the release branch, once it has been merged into the mod branch, it should be deleted.

| Item  | Description  |
|---|---|
| type  | Feature, Bug  |
| description  | Very brief description of the change being introduced |
